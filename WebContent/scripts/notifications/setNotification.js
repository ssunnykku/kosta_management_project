// 글 수정 버튼
const editBtn = document.querySelector(".edit-btn");

editBtn.addEventListener("click", function(){
	window.location.href = "controller?cmd=setNotificationUI&notificationId="+this.dataset["id"];
});

// 글 삭제 버튼


const deleteBtn = document.querySelector(".delete-btn");

deleteBtn.addEventListener("click", function(){
	const result = confirm("해당 글을 삭제하시겠습니까?");

	if(result){
		window.location.href = "controller?cmd=removeNotificationAction&notificationId="+this.dataset["id"];
	}
});