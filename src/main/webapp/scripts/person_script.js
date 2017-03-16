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
