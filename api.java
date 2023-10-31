<!DOCTYPE html>  
<html>  
<head>  
<title> Javascript Fetch API </title>  
</head>  
<body>  
<p> Javascript Fetch API  </p>  
<script>  
//get the URL of the data  
let url = 'https://jsonplaceholder.typicode.com/users/1';  
console.log(url);  
//Fetch API method for getting requests  
let fetchfetch_Res = fetch(  
url);  
// fetch variable is the promise to resolve response using.then() method  
// display data as an output  
fetch_Res.then(resp =>  
resp.json()).then(datas => {  
console.log(datas)  
})  
</script>  
</body>  
</html>  
