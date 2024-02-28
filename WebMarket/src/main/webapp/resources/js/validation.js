function CheckAddProduct(){
	
	var productId = document.getElementById("productId");
	var name = document.getElementById("name");
	var unitPrice = document.getElementById("unitPrice");
	var unitsInStock = document.getElementById("unitsInStock");
	
	if(!check(/^P[0-9]{4,11}$/,productId,
	"[상품코드]\nP와 숫자를 조합하여 5~12자리까지 입력하세요\n처글자는 반드시 P로 시작하세요"))
		return false;
		
	if (name.value.length < 4||name.value.length>12){
		alert("[사품명]\n 최소 4자에서 12자까지 입ㄺ하세요");
		name.select();
		name.focus();
		return false;
	}
	
	if (unitPrice.value.length == 0||isNaN(unitPrice.value)){
		alert("[가격]\n숫자만 입력하세요");
		unitPrice.selcet();
		unitPrice.focus();
		return false;
	}
	
	if(unitPrice.value<0){
		alert("[가격]\n음수는 입력할 수 없습ㄴ디ㅏ");
		unitPrice.select();
		unitPrice.focus();
		return false;
	}else if(!check(/^\d+(?:[.]?[\d]?[\d])?$/, unitPrice,"[가격]\n소수점 둘째자리까지만 입력하세요"))
		return false;
		
	if(isNaN(unitsInStock.value)){
		alert("[재고수]\n숫자만 입력하세요");
		unitsInStock.select();
		unitsInStock.focus();
		return false;
	}
	
	function check(regExp, e, msg){
		if (regExp.test(e.value)){
			return true;
		}
		alert(msg);
		e.select();
		e.focus();
		return false;
	}
	document.newProduct.submit()
}