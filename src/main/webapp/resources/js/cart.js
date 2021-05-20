

function deleteConform(){
	
	
	if(!confirm("주문 취소 하시겠습니까?"))
		{
			return;
		}
	else
		location.href="cart_del_all.do";
};

function buyConform(f){
	
var name=document.getElementById("name").value;

	if(name==null)
	{
		return;
	}
	if(!confirm("주문하시겠습니까?"))
		{
			return;
		}
		f.submit();
};

function su(idx){
	
	var cnt = document.getElementById(idx).value;
	var url = "update_cart.do?idx="+idx+"&cnt="+cnt;
	sendRequest(url, null, resultFn, "GET");
}

function resultFn(){

		
			location.href="cart.do";
	
		
	};