/*
DescendantToken
limitedTokens = STRING_LITERAL
maximumDepth = 1
maximumMessage = Literal Strings should be compared using equals(), not ''==''.
maximumNumber = 0
minimumDepth = (default)0
minimumMessage = (default)null
minimumNumber = (default)0
sumTokenCounts = (default)false
tokens = EQUAL, NOT_EQUAL


*/

package com.puppycrawl.tools.checkstyle.checks.descendanttoken;

public class InputDescendantTokenStringLiteralEquality
{
    void foo(String name)
    {
        if (name == "Lars") // violation 'Literal Strings .* be compared using equals(), not '==''
        {
            // flagged, should use equals
        }

        if ("Oleg" == name) // violation 'Literal Strings .* be compared using equals(), not '==''
        {
            // flagged, should use equals
        }

        if ("Oliver" == "Oliver") // violation 'Lit.* Strings .* compared using equals(), not '==''
        {
            // doesn't make much sense because this can be evaluated
            // to true at compile-time, but is flagged anyway
        }

        String compare = "Rick";
        if (name == compare)
        {
            // currently not flagged.
            //
            // Implementing this is very complicated, we would need
            // - type info on the == operands
            // - prevent false alarms where the user explicitly wants
            //   to compare object identities
            //
            // My current feeling is that we should leave finding
            // this one to manual code inspections. After all MCI is
            // what some of us get paid for :-)
        }

        if ("Rick".toUpperCase(java.util.Locale.getDefault())
              == "Rick".toLowerCase(java.util.Locale.getDefault()))
        {
            // completely dynamic, don't flag
        }
    }
}
