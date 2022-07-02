# hilt_dependency_injection

<h2>The Dependency Injection (DI) via Hilt</h2>
<p>
<h3 style="text-align: right;">To Connect Or Follow</h3>
<div style="text-align: right;">
<a href="https://www.linkedin.com/in/fahadammar/" target="_blank">
<img src="linkedin.png" width="250px" height="100px" alt="Fahad Ammar LinkedIn"/>
</a>
</div>
<p>
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

<strong> These factors come into play when dependency injection is not implemented </strong>
<br/>
<strong> with the help of dependecy injection, these factors are removed </strong>

<p>

<h2> Types Of Dependency Injection </h2>
<p>
<strong> There are 3 types of <i>Dependency Injection (DI):</i> </strong>
<ol>
<li>Constructor Injection</li>
<li>Method Injection</li>
<li>Property Injection (sometimes also said as field injection)</li>
</ol>

</p>

<h2> The Annotations and Usages </h2>
<img src="d_i.png"/>
