# hilt_dependency_injection

<h2>The Dependency Injection (DI) via Hilt</h2>

<p>
<strong>
What is dependency injection and when/why should or shouldn't it be used?
</strong>
</p>

<p>
Dependency Injection is passing dependency to other objects or framework( dependency injector).
<br/>
Dependency injection is basically providing the objects, the object needs (its dependencies) instead of having it construct them itself. It's a very useful technique for testing, since it allows dependencies to be mocked or stubbed out.
</p>

<h2> Some Factors To be counted</h2>
<p>
<strong>The Following factors exists if the dependecy injection is not done or implemented</strong>
<br/>
<ol>
<li> Class is not testable </li>
<li> Code is not extensible </li>
<li> Single Responsibility </li>
<li> Lifetime of objects (Reusability) </li>
</ol>
<p>

<img src="d_i.png"/>
