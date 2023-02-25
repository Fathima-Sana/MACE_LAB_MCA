<?php
   $con=new mysqli("localhost","root","","book");
   if($con->connect_error){
       die("error in connection".$con->connect_error);
   }
   $q="select * from book_details where title='$_POST[ti]'";
   $p=$con->query($q);
   if($p->num_rows>0){
    echo '<table border="2"><tr><th colspan="5">BOOK DETAILS</th><tr>';
    while($d=$p->fetch_assoc())
    {
        echo '<tr><td>Accession number:</td><td>'.$d['ac_no'].'</td></tr>';
        echo '<tr><td>Title:</td><td>'.$d['title'].'</td></tr>';
        echo '<tr><td>Author:</td><td>'.$d['author'].'</td></tr>';
        echo '<tr><td>Edition:</td><td>'.$d['edition'].'</td></tr>';
        echo '<tr><td>Publisher:</td><td>'.$d['publisher'].'</td></tr>';
    }
    echo '</table>';
   }