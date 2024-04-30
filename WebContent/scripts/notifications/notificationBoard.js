const notificationEnrollBtn = document.querySelector(
		'#notification-enroll-btn'
);

const notificationDeleteBtn = document.querySelector(
		'#notification-delete-btn'
);
const notificationCheckboxAll = document.querySelectorAll(
		'.notificationBoard-check'
);

const notificationTable = document.querySelector("#notification-table");


function pageLoad() {


	fetch("controller?cmd=notificationBoardAction")
	.then((response) => response.json())
	.then((data) => {
		let result = '';
		for (var i = 0; i < data.length; i++) {
			const notification= data[i];

			result += `<div id="notification-table-row">
			<div class="notificationBoard-checkbox">
			<input type="checkbox" name="" class="notificationBoard-check"
				value="80" />
					</div>
			<div class="notificationBoard-no">
			<span>${notification.notificationId}</span>
			</div>
			<div class="notificationBoard-title">
			<span>${notification.title}</span>
			</div>
			<div class="notificationBoard-enroll-date">
			<span>${notification.notificationDate}</span>
			</div>
			<div class="notificationBoard-writer">
			<span>${notification.name}</span>
			</div>
			</div>`

		}

		$('#notification-table').append(result);
	})
}


function openEnrollPage() {
	window.location.href = 'controller?cmd=addNotificationUI';
}

function deletePage() {
	let deletedData = [];
	notificationCheckboxAll.forEach( (box) => {
		if (box.checked == true) {

//			fetch("controller?cmd=controller?deleteNotificationAction", {
			//  method: "DELETE",
			//})
			//  .then((response) => response.json())
			//  .then((data) => console.log(data));
			//  })
			deletedData.push(box.value);
		}


	});
}


// id 값을 보내줌(리스트)
// dao에서 for문 돌려서 삭제해줌
//}

notificationEnrollBtn.addEventListener('click', openEnrollPage);
notificationDeleteBtn.addEventListener('click', deletePage);
document.addEventListener("DOMContentLoaded", pageLoad);
