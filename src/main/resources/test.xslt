<?xml version="1.0" encoding="UTF-8"?>
<html xsl:version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <body style="font-size:12pt;background-color:#EEEEEE">
        <h1 style="font-size:20pt;color:#FF0000">Hello World DOM + XML + XSLT</h1>
        <table border="1">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>maths</td>
                <td>physics</td>
                <td>Telugu</td>
                <td>Average</td>
            </tr>
            <xsl:for-each select="Students/Student">
                <tr>
                    <td>
                        <xsl:value-of select="@id"/>
                    </td>
                    <td>
                        <xsl:value-of select="name"/>
                    </td>
                    <td>
                        <xsl:value-of select="maths"/>
                    </td>
                    <td>
                        <xsl:value-of select="physics"/>
                    </td>

                    <td>
                        <xsl:value-of select="telugu"/>
                    </td>
                    <td>
                        <xsl:value-of select="average"/>
                    </td>
                </tr>
            </xsl:for-each>
        </table>
    </body>
</html>