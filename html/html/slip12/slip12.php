<?php 
$x=$_POST['s1']; 
$y=$_POST['s2']; 
$op=$_POST['op']; 
 function add($x=4,$y=2) 
 { 
 
 $result=$x+$y; 
 echo"adition is $result"; 
 } 
 function sub($x=4,$y=2) 
 { 
 
 $result=$x-$y; 
 echo"subtraction is $result"; 
 } 
switch ($op) 
{ 
case"1": add($x,$y); 
 break; 
case"2": sub($x,$y); 
 break; 
} 
?>


<?php 
include'slip12.php'; 
?>