//HTTP Server using NodeJS
var http = require('http');
var reqListen = function (req,res) {
	res.writeHead(200);
	res.end('Hey! I am Server!!\n');
}

var server = http.createServer(reqListen);
server.listen(8080);