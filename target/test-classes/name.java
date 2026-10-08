<groups>
	<run>
		<include name="Master"/>
		<!--<include name="Sanity"/> -->
		<!--<include name="Regression"/>-->
		<!--<exclude name=""></exclude>-->
	</run>
</groups>

<listeners>
	<listener class-name="utilities.ExtentReportManager"/>
</listeners>

  <test name="Linux-Chrome">
    <parameter name="os" value="Linux"/>
    <parameter name="browser" value="chrome"/>
     
    <classes>
           <class name="testCases.TC001_AccountRegistrationTest"/> 
     		<class name="testCases.TC002_LoginTest"/> 
    </classes>
  </test> 
