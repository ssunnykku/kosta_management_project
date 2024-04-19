const notificationEnrollBtn = document.querySelector(
  '#notification-enroll-btn'
);
const notificationEditBtn = document.querySelector('#notification-edit-btn');
const notificationDeleteBtn = document.querySelector(
  '#notification-delete-btn'
);
const notificationCheckboxAll = document.querySelectorAll(
  '.notificationBoard-check'
);

function openEnrollPage() {
  window.location.href = '../../html/notifications/setNotification.html';
}

function openEditPage() {
  let deletedData = [];
  notificationCheckboxAll.forEach((box) => {
    if (box.checked == true) {
      deletedData.push(box.value);
    }
  });

  console.log(deletedData);
}

notificationEnrollBtn.addEventListener('click', openEnrollPage);
notificationDeleteBtn.addEventListener('click', openEditPage);
