

function regEmp(){

    console.log($("#fornavn").val())
    console.log($("#etternavn").val())
    console.log("awdsd")
    const emp = {
        Firstname: $("#fornavn").val(),
        Lastname: $("#etternavn").val(),
        password:$("#password").val(),
        epost: $("#epost").val()
    }


    if (validering(emp)) {

        $.post("/lagre", emp, function () {
            hentAlle();
        });
        $("#fornavn").val("");
        $("#etternavn").val("");
        $("#epost").val("");
    }
    function hentAlle() {
        $.get("/hente", function (employess) {
            console.log(employess)

            if(employess.length > 0) formaterData(employess);
        });
    }

    function slettAlle() {
        $.get("/slett", function () {
            $("#register").html("");
        })
    }




    function validering(emp) {
        const keys = Object.keys(emp);
        let valid = true;
        for (key of keys) {
            $(`#${key}error`).html("");
            if (emp[key] === "" || emp[key] === null) {
                $(`#${key}error`).html(`Må skrive noe i ${key}`);
                valid = false;
            }
        }
        return valid;
    }






}