const notificationEnrollBtn = document.querySelector(
  '#notification-enroll-btn'
);
const notificationDeleteBtn = document.querySelector(
  '#notification-delete-btn'
);
const notificationCheckboxAll = document.querySelectorAll(
  '.notificationBoard-check'
);

function openEnrollPage() {
  window.location.href = '../../html/notifications/setNotification.html';
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

notificationEnrollBtn.addEventListener('click', openEnrollPage);
notificationDeleteBtn.addEventListener('click', openEditPage);


///////////////////

const notification_title = document.querySelector('#notificationBoard-title');
console.log(notification_title);

notification_title.addEventListener('click',openPost());

function openPost(){
	window.location.href = 'controller?cmd=notificationPostUI';
}

