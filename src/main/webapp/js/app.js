angular.module("bookApp", ['ngRoute', 'ui.router']);
angular.module("bookApp").config(function($routeProvider, $stateProvider) {
    $routeProvider.when("/add-book",{
    	 templateUrl: 'views/add-book.html'
    });
    
    $routeProvider.when("/agendar",{
   	 templateUrl: 'views/appointment/appointment_app.html',
   	 controller: 'AppointmentCtrl',
   	 resolve:{
   		healthInsurances: function  (AppointmentService){
   			return AppointmentService.getHealthInsurances();
   		}
   	 }
    });
   
    $routeProvider.when("/calendario/:crmDoctor/:idHi",{
    	templateUrl: 'views/appointment/calendar.html',
    controller: 'calendarCtrl',
    resolve:{
    		appointmentList: function  ($route, AppointmentService){
    			return AppointmentService.getAppointmentByHeathInsuranceAndDoctor($route.current.params.idHi, $route.current.params.crmDoctor);
    		}
   	 }
    });
    
  $routeProvider.when("/inseredatos/:crmDoctor/:idApp",{
	 templateUrl: 'views/appointment/insert_pacient_data.html',
	 controller: 'pacientDataCtrl' 
  });
  
  $routeProvider.when("/saveAppointment/",{
		 templateUrl: 'insert_pacient_data_success.html',
		 controller: 'pacientDataCtrl' 
	  });
  
  $routeProvider.when("/anulaBuscaCpf",{
   	 templateUrl: 'buscarCPF.html',
   	 controller: 'AppCtrl' 
   });
  
  $routeProvider.when("/appointmentList/:cpf",{
	   	 templateUrl: 'appointmentListPacient.html',
	   	 controller: 'cancelAppointmentCtrl',
	   	 resolve:{
	    		appointmentList: function  ($route, AppointmentService){
	    			return AppointmentService.getAppointmentByCPF($route.current.params.cpf);
	    		}
	   	 } 
	   });
  
 $routeProvider.when("/gerenciar",{
  	 templateUrl: 'gerenciar_consultas.html',
  	 controller: 'SearchForAppointmentCtrl' 
  });
//    $stateProvider.state({
//    		name:'inseredados',
//		   url:"/inseredatos/:docName/:idApp",
//		   views:{
//			   controller: 'pacientDataCtrl' ,
//			   templateUrl: 'insert_pacient_data.html',
//		   },
//		    	 
//		   	 params:{
//		   		docName: null,
//		    	   		idApp: null
//		
//		   	 
//		   	}
    
    //Sem resolve
    //,
//		    resolve: { 
//		    	function (params){
//		    			return console.log(params);
//		    		}
//		    }
//  	});
//   		 ,
//    	 resolve: {
//    		 appointmentList = function (AppointmentService){
//    			 return AppointmentService.getAppointmentByHeathInsuranceAndDoctor(idHi, crmDoctor);
//    		 }.getAppointmentByHeathInsuranceAndDoctor(idHi, crmDoctor).then(function (data){
//    			 console.log("consultas");
//    				console.log(data);
//    				$scope.appointmentList = data.data.doctorList;
//    			}).catch(function (err){
//    				console.log("deu ruim");
//    			});
//    		 }
			
   
    
//    $routeProvider.when("/inseredatos/:crmDoctor/:idApp",{
//    	 templateUrl: 'insert_pacient_data.html',
//    	 controller: 'pacientDataCtrl' 
//    });
    
   
//    $routeProvider.when("/saveAppointment/:pacient",{
//   	 templateUrl: 'insert_pacient_data_success.html',
//   	 controller: 'pacientDataCtrl',
//   	params: $routeProvider.pacient
      
  // 	 resolve: { function ($route){
   	//	 pacientData: return $route.current.params;
//   		 console.log($routeProvider);
//   		var obj = {
//				name: pacient.name,
//				cpf: pacient.cpf,
//				phone: pacient.phone,
//				cellphone: pacient.cellphone,
//				email: pacient.email,
//				doctor:{
//					crm: 'seb-sc',//selectedDoctor.crm,
//					appointment : [{
//						id: 2
//					}]
//				}
	//	}
   	 //}
//   });
    
    $routeProvider.otherwise({redirectTo:'/add-book'});
//    $urlRouterProvider.otherwise('/home');
//    
//    $stateProvider
//        
//        // HOME STATES AND NESTED VIEWS ========================================
//        .state('home', {
//            url: '/home',
//            templateUrl: '../hello.html',
//            controller: SearchForAppointmentCtrl
//        })
//        
//        // nested list with custom controller
//        .state('home.list', {
//            url: '/list',
//            templateUrl: 'partial-home-list.html',
//            controller: function($scope) {
//                $scope.dogs = ['Bernese', 'Husky', 'Goldendoodle'];
//            }
//        })
//        
//        // nested list with just some random string data
//        .state('home.paragraph', {
//            url: '/paragraph',
//            template: 'I could sure use a drink right now.'
//        })
//        
//        // ABOUT PAGE AND MULTIPLE NAMED VIEWS =================================
//        .state('about', {
//            url: '/about',
//            views: {
//                '': { templateUrl: 'partial-about.html' },
//                'columnOne@about': { template: 'Look I am a column!' },
//                'columnTwo@about': { 
//                    templateUrl: 'table-data.html',
//                    controller: 'scotchController'
//                }
//            }
//            
//        });
        
});