<<<<<<< HEAD
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jsp2.examples.simpletag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import jsp2.examples.BookBean;

/**
 * SimpleTag handler that pretends to search for a book, and stores
 * the result in a scoped variable.
 */
public class FindBookSimpleTag extends SimpleTagSupport {
    private String var;

    private static final String BOOK_TITLE = "The Lord of the Rings";
    private static final String BOOK_AUTHOR = "J. R. R. Tolkien";
    private static final String BOOK_ISBN = "0618002251";

    @Override
    public void doTag() throws JspException {
        BookBean book = new BookBean( BOOK_TITLE, BOOK_AUTHOR, BOOK_ISBN );
        getJspContext().setAttribute( this.var, book );
    }

    public void setVar( String var ) {
        this.var = var;
    }
}
=======
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jsp2.examples.simpletag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import jsp2.examples.BookBean;

/**
 * SimpleTag handler that pretends to search for a book, and stores
 * the result in a scoped variable.
 */
public class FindBookSimpleTag extends SimpleTagSupport {
    private String var;

    private static final String BOOK_TITLE = "The Lord of the Rings";
    private static final String BOOK_AUTHOR = "J. R. R. Tolkien";
    private static final String BOOK_ISBN = "0618002251";

    @Override
    public void doTag() throws JspException {
        BookBean book = new BookBean( BOOK_TITLE, BOOK_AUTHOR, BOOK_ISBN );
        getJspContext().setAttribute( this.var, book );
    }

    public void setVar( String var ) {
        this.var = var;
    }
}
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
