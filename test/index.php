<?php
require_once("conn.php");
$sql = "SELECT * FROM staff_info ORDER BY staff_id DESC";
$result = mysqli_query($conn,$sql);
?>
<html>
<head>
<title>Staff List</title>
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
<form name="frmUser" method="post" action="">
<div style="width:500px;">
<div class="message"><?php if(isset($message)) { echo $message; } ?></div>
<div align="right" style="padding-bottom:5px;"><a href="add_staff.php" class="link"><img alt='Add' title='Add' src='images/add.png' width='15px' height='15px'/> Add New Staff</a></div>
<table border="0" cellpadding="10" cellspacing="1" width="500" class="tblListForm">
<tr class="listheader">

<td>First Name</td>
<td>Last Name</td>
<td>Address</td>
<td>Actions</td>
</tr>
<?php
$i=0;
while($row = mysqli_fetch_array($result)) {
if($i%2==0)
$classname="evenRow";
else
$classname="oddRow";
?>
<tr class="<?php if(isset($classname)) echo $classname;?>">

<td><?php echo $row["staff_fname"]; ?></td>
<td><?php echo $row["staff_lname"]; ?></td>
<td><?php echo $row["staff_address"]; ?></td>
<td><a href="edit_staff.php?staff_id=<?php echo $row["staff_id"]; ?>" class="link"><img alt='Edit' title='Edit' src='images/edit.png' width='15px' height='15px' hspace='10' /></a>  <a href="delete_staff.php?staff_id=<?php echo $row["staff_id"]; ?>"  class="link"><img alt='Delete' title='Delete' src='images/delete.png' width='15px' height='15px'hspace='10' /></a></td>
</tr>
<?php
$i++;
}
?>
</table>
</form>
</div>
</body></html>
