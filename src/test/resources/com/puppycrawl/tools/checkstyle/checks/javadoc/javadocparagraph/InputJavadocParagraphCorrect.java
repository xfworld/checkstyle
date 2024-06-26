/*
JavadocParagraph
violateExecutionOnNonTightHtml = (default)false
allowNewlineParagraph = (default)true


*/

package com.puppycrawl.tools.checkstyle.checks.javadoc.javadocparagraph;

/**
 * Some Javadoc.
 *
 * <p>Some Javadoc.
 *
 */
class InputJavadocParagraphCorrect {

    /**
     * Some Javadoc.
     *   
     * <p>{@code function} will never be invoked with a null value.
     *
     * @since 8.0
     */
    public static final byte NUL = 0;

    /**
     * Some Javadoc.
     *
     * <p>Some Javadoc.
     *
     * <pre>
     * class Foo {
     *
     *   void foo() {}
     * }
     * </pre>
     *
     * @see <a href="http://www.gwtproject.org/doc/latest/DevGuideOrganizingProjects.html#DevGuideModules">
     *     Documentation about GWT emulated source</a>
     */
    boolean emulated() {return false;}

    /**
     * Some Javadoc.
     *
     *<pre>
     * Test
     * </pre>
     *
     * <pre>
     * Test
     * </pre>
     */
    boolean test() {return false;}

    /**
     * Some Javadoc.
     *
     * <p>Some Javadoc.
     *
     */
     class InnerInputJavadocParagraphCorrect {

        /**
         * Some Javadoc.
         *
         * <p>Some Javadoc.
         *
         * <p>Some Javadoc.
         *
         * @since 8.0
         */
        public static final byte NUL = 0;

        /**
         * Some Javadoc.
         *
         * <p>Some Javadoc.
         *
         * @see <a href="http://www.gwtproject.org/doc/latest/DevGuideOrganizingProjects.html#DevGuideModules">
         *     Documentation about GWT emulated source</a>
         */
        boolean emulated() {return false;}
    }

     InnerInputJavadocParagraphCorrect anon = new InnerInputJavadocParagraphCorrect() {

            /**
         * Some Javadoc.
         *
         * <p>Some Javadoc.
         *
         * <p>Some Javadoc.
         *
         * @since 8.0
         */
        public static final byte NUL = 0;

        /** 
         * Some Javadoc with space at the end of first line.
         *
         * <p>Some Javadoc.
         *
         * <p>Some Javadoc.
         *
         * @see <a href="http://www.gwtproject.org/doc/latest/DevGuideOrganizingProjects.html#DevGuideModules">
         *     Documentation about GWT emulated source</a>
         */
        boolean emulated() {return false;}
    };
}

/*
 *  This comment has paragraph without '<p>' tag.
 *
 *  It's fine, because this is plain comment.
 */
class ClassWithPlainComment {}
