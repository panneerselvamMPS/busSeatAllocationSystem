<div data-ng-controller="loginPageValuesController">
<div style="background-color:#e7feff;" class="container">
  <h2 class="d-flex justify-content-center">Login</h2><br><br>
  <form>
	  <!-- <table>
		  <tbody> -->
			  <!-- <tr>
			      <td style="width:5%"></td>
				  <td style="width:5%"> -->
				   <div class="form-group">
				      <label style="margin-left: 470px;" for="userName">Username</label>
				      <input type="text" class="form-control" id="userName" data-ng-model="loginPageValues.userName" style="width:200px;margin-left: 470px;" data-ng-blur="custvalidation('userName',loginPageValues.userName)">
				    <!-- </div>
				  </td> -->
				  <!-- <td style="width:5%"> -->
				   <div class="form-group">
				      <label style="margin-left: 470px;" for="password">Password</label>
				      <input type="text" class="form-control" id="password" data-ng-model="loginPageValues.password" style="width:200px;margin-left: 470px;" data-ng-blur="custvalidation('password',loginPageValues.password)">
				   <!-- </div>
				  </td>
			  </tr> -->
		  <!-- </tbody>
	  </table> -->
  <br>
  <div class="d-flex justify-content-center">
  <button type="button" ng-click="custsubmit()" class="btn btn-success">Submit</button>
    &nbsp;
  <button type="button" ng-click="custreset()" class="btn btn-success">Reset</button>
  </div>
  </form>
 </div>
  <br>
  <button type="button" data-toggle="modal" data-target="#myModal" id="id1" ng-show="false">Alert</button>
  <div class="modal fade" id="myModal" role="dialog" data-backdrop="static" data-keyboard="true">
	 <div class="modal-dialog modal-dialog-centered">
	   <div class="modal-content">
		 <div class="modal-header">
		   <h4 class="modal-title d-flex justify-content-center">{{alertmessage}}</h4>
		 </div>
		 <div class="modal-footer d-flex justify-content-center">
		   <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		   <button type="button" class="btn btn-default" data-dismiss="modal">OK</button>
		 </div>
	   </div>
	 </div>
   </div>
</div>