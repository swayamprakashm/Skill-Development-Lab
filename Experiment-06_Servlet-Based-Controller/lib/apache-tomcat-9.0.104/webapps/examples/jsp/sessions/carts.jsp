<<<<<<< HEAD
<%--
 Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
--%>
<html>
<jsp:useBean id="cart" scope="session" class="sessions.DummyCart" />

<jsp:setProperty name="cart" property="*" />
<%
    cart.processRequest();
%>


<FONT size = 5 COLOR="#CC0000">
<br> You have the following items in your cart:
<ol>
<%
    Item[] items = cart.getItems();
    for (Item item : items) {
%>
<li> <% out.print(util.HTMLFilter.filter(item.getTitle())); %>
<%
    }
%>
</ol>

</FONT>

<hr>
<%@ include file ="shopping.jsp" %>
</html>
=======
<%--
 Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
--%>
<html>
<jsp:useBean id="cart" scope="session" class="sessions.DummyCart" />

<jsp:setProperty name="cart" property="*" />
<%
    cart.processRequest();
%>


<FONT size = 5 COLOR="#CC0000">
<br> You have the following items in your cart:
<ol>
<%
    Item[] items = cart.getItems();
    for (Item item : items) {
%>
<li> <% out.print(util.HTMLFilter.filter(item.getTitle())); %>
<%
    }
%>
</ol>

</FONT>

<hr>
<%@ include file ="shopping.jsp" %>
</html>
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
