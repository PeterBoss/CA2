function getAllPersons() {
    fetch("./api/person/complete", {method: "GET"})
            .then(function (response) {
                return response.text();
            }).then(function (text) {
        return text;
    });
}
function getPersonById(id) {
    fetch("./api/person/complete/" + id, {method: "GET"})
            .then(function (response) {
                return response.text();
            }).then(function (text) {
        return text;
    });
}
function createPerson(personJSON) {
    fetch("./api/person/", {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'},
        method: "POST",
        body: JSON.stringify(personJSON)
    }).then(function (response) {
        return response.text();
    }).then(function (text) {
        return text; 
    });
}


function testCreatePerson() {
    fetch("./api/person/", {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'},
        method: "POST",
        body: JSON.stringify({"firstName" : "Peter", "lastName" : "Thomsen", "email" : "test@mail.com", "phones" : [{"number" : "45698712", "description" : "test desc"}]})
    }).then(function (response) {
        return response.text();
    }).then(function (text) {
        console.log(text);
    });
}

//var button = document.getElementById("testButton");
//
//button.addEventListener("click", function(evt) {
//    getAllPersons();
//});

//window.addEventListener("load",testCreatePerson);
