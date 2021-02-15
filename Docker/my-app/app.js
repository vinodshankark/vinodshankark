const express = require('express');
const path = require('path');
const fs = require('fs');
const mongoClient = require('mongodb').mongoClient;
var bodyParser = require('body-parser');
const app = express();
const port = 3000;

app.use(bodyParser.urlencoded({
  extended: true
}));
app.use(bodyParser.json());


app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, "index.html"));
});

app.get('/get-profile', function(req, res) {
  var response = res;
  MongoClient.connect('mongodb://admin:password@localhost:27017', function(err, client){
    if(err) throw err;
    var db = client.db('user-account');
    var query = {userid: 1};
    db.collection('users').findOne(query, function(err, result) {
      if(err) throw err;
      client.close();
      response.send(result);
    });
  });
});

app.post('/update-profile', function(req, res) {
  var userObj = req.body
  var response = res;
  console.log('connecting to db...');
  MongoClient.connect('mongodb://admin:password@localhost:27017', function(err, client){
    if(err) throw err;
    var db = client.db('user-account');
    userObj['userid'] = 1;
    var query = {userid: 1};
    var newValues = {$set: userObj};
    console.log('successfully connected to user-account db...');
    db.collection('users').updateOne(query, newValues, {upsert: true}, function(err, res) {
      if(err) throw err;
      console.log('successfully inserted')
      client.close();
      response.send(userObj);
    });
  });
});

app.get('/profile-pic', function(req, res){
    var img = fs.readFileSync('profile-pic.jpg');
    res.writeHead(200, {'Content-Type': 'image/jpg'});
    res.end(img, 'binary');
});

app.listen(port, () => {
  console.log(`Example app listening at http://localhost:${port}`)
})