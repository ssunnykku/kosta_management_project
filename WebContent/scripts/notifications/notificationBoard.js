const notificationEnrollBtn = document.querySelector(
  "#notification-enroll-btn"
);
const notificationDeleteBtn = document.querySelector(
  "#notification-delete-btn"
);
const notificationCheckboxAll = document.querySelectorAll(
  ".notificationBoard-check"
);

function openEnrollPage() {
  window.location.href = "../../html/notifications/setNotification.html";
}

//function openEditPage() {
//  let deletedData = [];
//  notificationCheckboxAll.forEach((box) => {
//    if (box.checked == true) {
//      deletedData.push(box.value);
//    }
//  });

//  console.log(deletedData);
//}

notificationEnrollBtn.addEventListener("click", openEnrollPage);
notificationDeleteBtn.addEventListener("click", openEditPage);

///////////////////

// const notification_title = document.querySelector('#notificationBoard-title');
// console.log(notification_title);

// notification_title.addEventListener('click',openPost());

// function openPost(){
// 	window.location.href = 'controller?cmd=notificationPostUI';
// }

// 글 상세보기
const title = document.querySelectorAll(".notificationBoard-title");

for (var i in title) {
  title[i].addEventListener("click", function () {
    window.location.href =
      "controller?cmd=notificationPostUI&notificationId=" + this.dataset["id"];
    //title.dataset.id -> 데이터 속성을 불러옴
  });
}

// 글 동록 버튼
const EnrollBtn = document.querySelector("#notification-enroll-btn");

EnrollBtn.addEventListener("click", function () {
  winndow.location.href = "controller?cmd=addNotificationUIAction";
});

// 글 삭제 버튼
