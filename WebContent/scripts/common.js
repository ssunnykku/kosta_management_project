$("#nav-ul").mouseenter(()=>{
	$("#nav-wrapper-dropdown").removeAttr("style");
})

$("#nav-wrapper-dropdown").mouseleave(()=>{
	$("#nav-wrapper-dropdown").css("display","none");
})

let urlParams = new URL(location.href).searchParams;
let cmd = urlParams.get('cmd');

/** 메뉴 색상 변경 **/
$("#nav-notification").mouseenter(()=>{
	$("#nav-notification").css("color", "#2d62ea");
})

$("#nav-course").mouseenter(()=>{
	$("#nav-course").css("color", "#2d62ea");
})

$("#nav-certification").mouseenter(()=>{
	$("#nav-certification").css("color", "#2d62ea");
})

$("#nav-scholarship").mouseenter(()=>{
	$("#nav-scholarship").css("color", "#2d62ea");
})


$("#nav-benefit-manage").mouseenter(()=>{
	$("#nav-benefit-manage").css("color", "#2d62ea");
})


$("#nav-student").mouseenter(()=>{
	$("#nav-student").css("color", "#2d62ea");
})


$("document").ready( ()=> {

	switch(cmd) {
	case "notificationBoardUI":
		$("#nav-notification").css("color", "#2d62ea");

		$("#nav-course").mouseleave(()=>{$("#nav-course").css("color", "");})
		$("#nav-certification").mouseleave(()=>{$("#nav-certification").css("color", "");})
		$("#nav-scholarship").mouseleave(()=>{$("#nav-scholarship").css("color", "");})
		$("#nav-benefit-manage").mouseleave(()=>{$("#nav-benefit-manage").css("color", "");})
		$("#nav-student").mouseleave(()=>{$("#nav-student").css("color", "");})
		
		break;
		
	case "courseBoardUI":
		$("#nav-course").css("color", "#2d62ea");
		$("#nav-notification").mouseleave(()=>{$("#nav-notification").css("color", "");})
		$("#nav-certification").mouseleave(()=>{$("#nav-certification").css("color", "");})
		$("#nav-scholarship").mouseleave(()=>{$("#nav-scholarship").css("color", "");})
		$("#nav-benefit-manage").mouseleave(()=>{$("#nav-benefit-manage").css("color", "");})
		$("#nav-student").mouseleave(()=>{$("#nav-student").css("color", "");})
		break;
		
	case "scholarshipBoardUI":
		$("#nav-scholarship").css("color", "#2d62ea");
		$("#nav-notification").mouseleave(()=>{$("#nav-notification").css("color", "");})
		$("#nav-course").mouseleave(()=>{$("#nav-course").css("color", "");})
		$("#nav-certification").mouseleave(()=>{$("#nav-certification").css("color", "");})
		$("#nav-benefit-manage").mouseleave(()=>{$("#nav-benefit-manage").css("color", "");})
		$("#nav-student").mouseleave(()=>{$("#nav-student").css("color", "");})
		break;
		
	case "scholarshipResultBoardUI":
		$("#nav-scholarship").css("color", "#2d62ea");

		$("#nav-notification").mouseleave(()=>{$("#nav-notification").css("color", "");})
		$("#nav-course").mouseleave(()=>{$("#nav-course").css("color", "");})
		$("#nav-certification").mouseleave(()=>{$("#nav-certification").css("color", "");})
		$("#nav-benefit-manage").mouseleave(()=>{$("#nav-benefit-manage").css("color", "");})
		$("#nav-student").mouseleave(()=>{$("#nav-student").css("color", "");})
		
		break;
	case "benefitBoardUI":
		$("#nav-benefit-manage").css("color", "#2d62ea");

		$("#nav-notification").mouseleave(()=>{$("#nav-notification").css("color", "");})
		$("#nav-course").mouseleave(()=>{$("#nav-course").css("color", "");})
		$("#nav-certification").mouseleave(()=>{$("#nav-certification").css("color", "");})
		$("#nav-scholarship").mouseleave(()=>{$("#nav-scholarship").css("color", "");})
		$("#nav-student").mouseleave(()=>{$("#nav-student").css("color", "");})

		break;
	case "benefitResultBoardUI":
		$("#nav-benefit-manage").css("color", "#2d62ea");

		$("#nav-notification").mouseleave(()=>{$("#nav-notification").css("color", "");})
		$("#nav-course").mouseleave(()=>{$("#nav-course").css("color", "");})
		$("#nav-certification").mouseleave(()=>{$("#nav-certification").css("color", "");})
		$("#nav-scholarship").mouseleave(()=>{$("#nav-scholarship").css("color", "");})
		$("#nav-student").mouseleave(()=>{$("#nav-student").css("color", "");})
		
		break;
	case "studentBoardUI":
		$("#nav-student").css("color", "#2d62ea");

		$("#nav-notification").mouseleave(()=>{$("#nav-notification").css("color", "");})
		$("#nav-course").mouseleave(()=>{$("#nav-course").css("color", "");})
		$("#nav-certification").mouseleave(()=>{$("#nav-certification").css("color", "");})
		$("#nav-scholarship").mouseleave(()=>{$("#nav-scholarship").css("color", "");})
		$("#nav-benefit-manage").mouseleave(()=>{$("#nav-benefit-manage").css("color", "");
		})
		break;
	case "attendanceBoardUI":
		$("#nav-student").css("color", "#2d62ea");

		$("#nav-notification").mouseleave(()=>{$("#nav-notification").css("color", "");})
		$("#nav-course").mouseleave(()=>{$("#nav-course").css("color", "");})
		$("#nav-certification").mouseleave(()=>{$("#nav-certification").css("color", "");})
		$("#nav-scholarship").mouseleave(()=>{$("#nav-scholarship").css("color", "");})
		$("#nav-benefit-manage").mouseleave(()=>{$("#nav-benefit-manage").css("color", "");})

		break;
	case "pointBoardUI":
		$("#nav-student").css("color", "#2d62ea");

		$("#nav-notification").mouseleave(()=>{$("#nav-notification").css("color", "");})
		$("#nav-course").mouseleave(()=>{$("#nav-course").css("color", "");})
		$("#nav-certification").mouseleave(()=>{$("#nav-certification").css("color", "");})
		$("#nav-scholarship").mouseleave(()=>{$("#nav-scholarship").css("color", "");})
		$("#nav-benefit-manage").mouseleave(()=>{$("#nav-benefit-manage").css("color", "");})
		break;
	}
})



