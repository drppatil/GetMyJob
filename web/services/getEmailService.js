/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


app.service('getEmailService', function () {
    var email;
    var setEmail = function (emailID) {
        email = emailID;
    };

    var getEmail = function () {
        return email;
    };


    return {
        setEmail: setEmail,
        getEmail: getEmail
    };
});