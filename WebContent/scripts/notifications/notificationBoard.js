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
  window.location.href = 'controller?cmd=addNotificationUI';
}

function deletePage() {
  let deletedData = [];
  notificationCheckboxAll.forEach( (box) => {
    if (box.checked == true) {
      deletedData.push(box.value);
    }
  });

  deleteData.forEach(()=> {
	  fetch("controller?cmd=controller?deleteNotificationAction", {
  method: "DELETE",
})
  .then((response) => response.json())
  .then((data) => console.log(data));
  })
  console.log(deletedData);
  
  // id 값을 보내줌(리스트)
  // dao에서 for문 돌려서 삭제해줌
}

notificationEnrollBtn.addEventListener('click', openEnrollPage);
notificationDeleteBtn.addEventListener('click', deletePage);
