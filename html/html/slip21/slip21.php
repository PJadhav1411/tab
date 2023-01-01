<?php 
$temp_array=range(31,45); 
$tot_temp = 0; 
$count = count($temp_array); 
echo "Total temp values are: ".$count; 
foreach($temp_array as $temp) 
{ 
$tot_temp += $temp; 
} 
$avg_high_temp = $tot_temp/$count; 
echo "<br> Average Temperature is : ".$avg_high_temp." 
"; 
sort($temp_array); 
echo " <br> List of five lowest temperatures :"; 
$res1= array_slice($temp_array,0,5); 
foreach($res1 as $high_temp) 
{ 
echo "<br> $high_temp"; 
} 
echo "<br> List of five highest temperatures :"; 
$res1= array_slice($temp_array,10); 
foreach($res1 as $high_temp) 
{ 
echo "<br> $high_temp"; 
} 
?>