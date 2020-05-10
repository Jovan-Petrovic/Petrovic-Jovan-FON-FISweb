<%-- 
    Document   : menu
    Created on : Apr 28, 2020, 1:41:14 PM
    Author     : KORISNIK
--%>
<div class="container">
    
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
      <!-- Brand -->
      <a class="navbar-brand" href="#">Logo</a>
      
      <!-- Links -->
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" href="/task1/app/department/all">All departments</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/task1/app/department/add">Add department</a>
          </li>
          
       <!-- Dropdown -->
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
              Profile
            </a>
            <div class="dropdown-menu">
              <a class="dropdown-item" href="#">My profile</a>
              <a class="dropdown-item" href="/task1/app/logout">Log out</a>
            </div>
          </li>
        </ul>
    </nav>
    
    Login as: ${sessionScope.loginUser.firstname} ${sessionScope.loginUser.lastname}
    
</div>
