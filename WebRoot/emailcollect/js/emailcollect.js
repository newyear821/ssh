$(document).ready(function(){
	bind();
});

var inputdef = "输入您的电子邮箱";
function bind(){
	//提交按钮事件
	$("#savebtn").click(function(){
		var val = $(".subbox input").val();
		alert(val);
		
   			$.ajax({
				type: "POST",
				url: "/ssh/emailcollect.action?method=saveEamil",
				data: {
   					email:val
   				},
				dataType: "txt",
				async:true,
				success:function(json){
					if(json != "error"){
						balance1 = json[0].totalBalance;
						balance2 = json[1].totalBalance;
						stime = json[1].callTime;
						setBalance(balance1,balance2,stime);
					}
				},
				error:function(e){
				}
			});
	});

	//输入框
	$(".subbox input").focus(function(){
		if($(this).val() == inputdef){
			$(this).val("");
		}
	});
	$(".subbox input").blur(function(){
		if($(this).val() == ""){
			$(this).val(inputdef);
		}
	});
}