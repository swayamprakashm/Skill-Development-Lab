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
<%@page session="false" import="java.util.Date,java.text.SimpleDateFormat"%>
Output from async1.jsp
Type is <%=request.getDispatcherType()%>
<%
  System.out.println("Inside Async 1");
  if (request.isAsyncStarted()) {
    request.getAsyncContext().complete();
  }
  Date date = new Date(System.currentTimeMillis());
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
%>
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
<%@page session="false" import="java.util.Date,java.text.SimpleDateFormat"%>
Output from async1.jsp
Type is <%=request.getDispatcherType()%>
<%
  System.out.println("Inside Async 1");
  if (request.isAsyncStarted()) {
    request.getAsyncContext().complete();
  }
  Date date = new Date(System.currentTimeMillis());
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
%>
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
Completed async request at <%=sdf.format(date)%>