function getAllcompanys() {
    fetch("./api/company/complet", {method: "GET"}).then(function (response) {
        return response.text();
    }).then(function (text) {
        return text;
    });

}

function getCompanyById(id) {
    fetch("./api/company/complete/" + id, {method: "GET"})
            .then(function (response) {
                return response.text();
            }).then(function (text) {
        return text;
    });
}
