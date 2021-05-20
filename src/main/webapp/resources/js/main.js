function addCart(name, price) {

	var url = "insert_cart.do?name=" + name + "&price=" + price;
	sendRequest(url, null, resultFn, "GET");

};

function resultFn() {

	if (xhr.readyState == 4 && xhr.status == 200) {
		var data = xhr.responseText;
		var json = eval(data);

		if (json[0].result == 'yes') {
			alert("장바구니에 담았습니다");

		} else {
			alert("해당 상품은 이미 장바구니에 담겨져 있습니다");

		}
	}

};

function button(su) {

	var btn1 = document.getElementById('button1');
	var btn2 = document.getElementById('button2');
	var btn3 = document.getElementById('button3');
	var btn4 = document.getElementById('button4');
	
	var set = document.getElementById('setBerger');
	var ber = document.getElementById('berger');
	var dri = document.getElementById('drink');
	var side = document.getElementById('sideMenu');
	
	if (su == 1) {
		
		
		set.classList.remove("d-none");
		ber.classList.add("d-none");
		dri.classList.add("d-none");
		side.classList.add("d-none");
		
		btn4.classList.replace('btn-dark','btn-right');
		btn2.classList.replace('btn-dark','btn-right');
		btn3.classList.replace('btn-dark','btn-right');
		btn1.classList.replace('btn-right','btn-dark');
		
	} else if (su == 2) {
		
		set.classList.add("d-none");
		ber.classList.remove("d-none");
		dri.classList.add("d-none");
		side.classList.add("d-none");
		
		btn4.classList.replace('btn-dark','btn-right');
		btn3.classList.replace('btn-dark','btn-right');
		btn1.classList.replace('btn-dark','btn-right');
		btn2.classList.replace('btn-right','btn-dark');
	} else if (su == 3) {
		
		set.classList.add("d-none");
		ber.classList.add("d-none");
		dri.classList.remove("d-none");
		side.classList.add("d-none");
		
		btn1.classList.replace('btn-dark','btn-right');
		btn2.classList.replace('btn-dark','btn-right');
		btn4.classList.replace('btn-dark','btn-right');
		btn3.classList.replace('btn-right','btn-dark');
		
	} else if (su == 4) {
		set.classList.add("d-none");
		ber.classList.add("d-none");
		dri.classList.add("d-none");
		side.classList.remove("d-none");
		
		btn1.classList.replace('btn-dark','btn-right');
		btn2.classList.replace('btn-dark','btn-right');
		btn3.classList.replace('btn-dark','btn-right');
		btn4.classList.replace('btn-right','btn-dark');
		
	}
};

var buttons = document.querySelectorAll('.btn')
buttons.forEach(function (button) {
  var button = new bootstrap.Button(button)
  button.toggle()
})
