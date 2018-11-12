function getPhrase()
{
var url=window.location.protocol+"//"+window.location.host+'/phrase';
var xmlhttp = new XMLHttpRequest();

xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
        var myObj = JSON.parse(this.responseText);
        document.getElementById("phrase-container").innerHTML = myObj.text;
    }
};

xmlhttp.open("GET", url, true);
xmlhttp.send();
}
