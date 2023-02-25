<?php
    $con=new mysqli("localhost","root","","Book");
    if($con->connect_error)
    {
        die("Connection failed".$con->connect_error);
    }
    $ins="insert into book_details values('$_POST[a_no]','$_POST[ti]','$_POST[au]','$_POST[ed]','$_POST[pub]')";
    if($con->query($ins)){
        echo '';
    }
    else{
        echo 'error in insertion'.$con->error;
    }
    $ret='select * from book_details';
    $ret2=$con->query($ret);
    if($ret2->num_rows>0){
        echo '<table border="2"><tr><th colspan="5">BOOK DETAILS</th><tr>';
        echo '<tr><th>Accession no</th><th>Title</th><th>Author</th><th>Edition</th><th>Publisher</th></tr>';
        while($arr=$ret2->fetch_assoc()){
            echo '<tr><td>'.$arr['ac_no'].'</td><td>'.$arr['title'].'</td><td>'.$arr['author'].'</td><td>'.$arr['edition'].'</td><td>'.$arr['publisher'].'</td></tr>';
       }
        echo '</table>';
    }
    include "booksearch.php";
?>