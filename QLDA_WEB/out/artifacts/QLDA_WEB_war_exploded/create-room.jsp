<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Create Room</title>
  <link rel="stylesheet" href="css/reset.css">
  <link rel="stylesheet" href="css/create-room.css">
</head>
<body>
<div class="container">
  <div class="right-group list-player">
    <div class="player">Thanh Phung</div>
    <div class="player">Quỳnh Như</div>
    <div class="player">Phan An</div>
    <div class="player">Gia Bảo</div>
    <div class="player">Việt Thông</div>
    <div class="player">Khắc Tạo</div>
  </div>
  <div class="left-group">
    <div class="id-group">
      <span class="label">ID Phòng</span>
      <span class="number-id">1001</span>
    </div>
    <div class="setting-group">
      <div class="setting-item">
        <span class="label">Số vòng đấu</span>
        <div class="input-group">
          <input type="number" class="number-input" value="5" min="2" max="15" onkeydown="return false">
          <span class="cur">vòng</span>
        </div>
      </div>
      <div class="setting-item">
        <span class="label">Thời gian mỗi vòng</span>
        <div class="input-group">
          <input type="number" class="number-input" value="15" min="5" max="60" onkeydown="return false">
          <span class="cur">giây</span>
        </div>
      </div>
      <div class="setting-item">
        <span class="label">Số người tối đa</span>
        <div class="input-group">
          <input type="number" class="number-input" value="2" min="2" max="12" onkeydown="return false">
          <span class="cur">người</span>
        </div>
      </div>
    </div>
    <div class="btn btn-create-room">Tạo Phòng</div>
  </div>

</div>

</body>
</html>
