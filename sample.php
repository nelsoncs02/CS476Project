<!doctype html>
<html>
<head>
<style type="text/css">
#a, #b, #c {
width: 30px
}
</style>
<title>Quadratic Equation Solver</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script>
$(document).ready(function() {
// your programming goes here
	$("#dostuff").click(function(){
		// get input
		var a = $("#a").val();
		var b = $("#b").val();
		var c = $("#c").val();
		// validate
		if(isNaN(a) || isNaN(b) || isNaN(c) || a==""){
			alert("Invalid input");
		}
		else{
			displayRoots(a, b, c);
		}
	});
	// calculate roots
	function displayRoots(a, b, c){
		var dis = (b*b)-(4*a*c);
		if(dis>0){
			var sol1 = 0.5*(-b+Math.sqrt(dis))/a;
			var sol2 = 0.5*(-b-Math.sqrt(dis))/a;
			$("#result").html("Solution 1: "+sol1+"  <br>Solution 2: "+sol2);
		}
		else if(dis==0){
			var sol= 0.5*(-b)/a;
			$("#result").html("Solution: "+sol);
		}
		else{
			var sol1 = 0.5*(-b+Math.sqrt(4*a*c-(b*b)))/a;
			var sol2 = 0.5*(-b-Math.sqrt(4*a*c-(b*b)))/a;
			$("#result").html("Solution 1: "+sol1+"  <br>Solution 2: "+sol2);
		}
	}
});
</script>
</head>
<body>
<!-- HTML content -->
<p>Enter constants A, B, C such that: Ax<sup>2</sup> + Bx + C = 0</p>
<p>A: <input type="text" name="a" id="a"></p>
<p>B: <input type="text" name="b" id="b"></p>
<p>C: <input type="text" name="c" id="c"></p>
<p><input type="button" value="Solve" id="dostuff"></p>
<p id="result"></p>
</body>
</html>
