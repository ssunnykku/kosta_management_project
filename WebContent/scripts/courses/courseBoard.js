// 글 등록 버튼
const
enrollBtn = document.querySelector("#enroll-btn");

enrollBtn.addEventListener("click", function() {
	location.href = "controller?cmd=addCourseUI";
});

// 글 수정 버튼
const
editBtn = document.querySelectorAll("#edit-btn");

for (var i = 0; i < editBtn.length; i++) {
	editBtn[i].addEventListener("click", function() {
		location.href = "controller?cmd=setCourseUI&courseId="
				+ this.dataset["id"];
	});
}