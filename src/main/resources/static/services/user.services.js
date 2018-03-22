app.factory('AddUserFactory', function ($resource, $location) {
    return $resource(($location.protocol() + "://" + $location.host() + ":" + $location.port()) + '/users', {}, {
        save: { method: 'POST' }
    });
});

app.factory('DataUsersFactory', function(){
    var UsersList = [];

    var init = function(usersList){
        UsersList = angular.copy(usersList);
    };

    var addUser = function(newuser) {
        UsersList.push(newuser);
    };

    var getUser = function(){
        return UsersList;
    };

    return {
        init : init,
        addUser: addUser,
        getUser: getUser
    };
});
