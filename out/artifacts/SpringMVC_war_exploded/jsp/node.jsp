<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>node test</title>
</head>
<body>

<script>
    function createXHR(){
        if(typeof XMLHttpRequest !='undefined'){
            return new XMLHttpRequest();
        }else if(typeof ActiveXObject !='undefined' ){
            if(typeof arguments.callee.activeXString!="string"){
                var versions=["MSXML2.XMLHttp.6.0","MSXML2.XMLHttp.3.0",
                            "MSXML2.XMLHttp"],
                        i,len;
                for(i=0,len=versions.length;i<len;i++){
                    try{
                        new ActiveXObject(versions[i]);
                        arguments.callee.activeXString=versions[i];
                        break;
                    }catch(ex) {

                    }
                }
            }
            return new ActiveXObject(arguments.callee.activeXString);
        }else{
            throw new Error("no xhr object available");
        }
    }
    function polling(url,method,data){
        method=method ||'get';
        data=data || null;
        var xhr=createXHR();
        xhr.onreadystatechange=function(){
            if(xhr.readyState==4){
                if(xhr.status>=200&&xhr.status<300||xhr.status==304||xhr.status==0){
                    console.log(xhr.responseText);
                }else{
                    console.log("fail");
                }
            }
        };
        xhr.open(method,url,true);
        xhr.send(data);
    }
    setInterval(function(){
        polling('http://localhost:8088/time','get');
    },2000);
</script>
</body>
</html>
