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
        return text;  //propably empty since the rest method is returns void
    });
}


function testCreatePerson() {
    fetch("./api/person/", {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'},
        method: "POST",
        body: JSON.stringify({"firstName" : "Peter"})
    }).then(function (response) {
        return response.text();
    }).then(function (text) {
        console.log(text);
    });
}

//window.addEventListener("load",testCreatePerson);
