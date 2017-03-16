function getAllPersons() {
    fetch("./api/person/complete", {method: "GET"})
            .then(function (response) {
                return response.text();
            }).then(function (text) {
        return text;
    });
}
