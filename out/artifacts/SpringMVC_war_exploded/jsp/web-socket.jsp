<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>web socket</title>
</head>
<body>


<script>
    var socket = new WebSocket('ws://localhost:9000/');
    socket.onopen = function(){
        console.log('Connected!');
    };

    socket.onmessage = function (event) {
        console.log('Received data:' + event.data);
        socket.close();
    };

    socket.onclose = function () {
        console.log('Lost connection!');
    };

    socket.onerror = function () {
        console.log('Error!');
    };

    socket.send('hello world!');

</script>
</body>
</html>
