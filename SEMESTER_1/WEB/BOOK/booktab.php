<?php
    $con=new mysqli("localhost","root","","Book");
    if($con->connect_error)
    {
        die("Connection failed".$con->connect_error);
    }
    $tb="create table book_details(ac_no int(3) primary key,title varchar(20) not null,author varchar(20),edition int(2),publisher varchar(30))";
    if($con->query($tb)){
        echo 'table book_details created';
    }
    else{
        echo 'error in creating table'.$con->error;
    }
?>