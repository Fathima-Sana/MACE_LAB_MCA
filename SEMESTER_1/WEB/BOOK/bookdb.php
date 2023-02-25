<?php
    $con=new mysqli("localhost","root","");
    if($con->connect_error)
    {
        die("Connection failed".$con->connect_error);
    }
    $db='create database Book';
    if($con->query($db)){
        print('Database created');
    }
    else{
        echo 'error in creating database'.$con->error;
    }
?>