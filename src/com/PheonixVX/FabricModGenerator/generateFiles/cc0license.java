package com.PheonixVX.FabricModGenerator.generateFiles;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class cc0license {

    public static void createCC0License(String filePath) {
        try {
            File file = new File(filePath + File.separator + "License.MD");
            if (file.createNewFile()) {
                JOptionPane.showMessageDialog(null, "License.MD created at " + file.toPath());
                FileWriter fileWriter = new FileWriter(file.toPath().toString());
                fileWriter.write("Creative Commons Legal Code\r\n\r" +
                        "\n" +
                        "CC0 1.0 Universal\r\n\r" +
                        "\n" +
                        "    CREATIVE COMMONS CORPORATION IS NOT A LAW FIRM AND DOES NOT PROVIDE\r\n" +
                        "    LEGAL SERVICES. DISTRIBUTION OF THIS DOCUMENT DOES NOT CREATE AN\r\n" +
                        "    ATTORNEY-CLIENT RELATIONSHIP. CREATIVE COMMONS PROVIDES THIS\r\n" +
                        "    INFORMATION ON AN \"AS-IS\" BASIS. CREATIVE COMMONS MAKES NO WARRANTIES\r\n" +
                        "    REGARDING THE USE OF THIS DOCUMENT OR THE INFORMATION OR WORKS\r\n" +
                        "    PROVIDED HEREUNDER, AND DISCLAIMS LIABILITY FOR DAMAGES RESULTING FROM\r\n" +
                        "    THE USE OF THIS DOCUMENT OR THE INFORMATION OR WORKS PROVIDED\r\n" +
                        "    HEREUNDER.\r\n\r" +
                        "\n" +
                        "Statement of Purpose\r\n\r" +
                        "\n" +
                        "The laws of most jurisdictions throughout the world automatically confer\r\n" +
                        "exclusive Copyright and Related Rights (defined below) upon the creator\r\n" +
                        "and subsequent owner(s) (each and all, an \"owner\") of an original work of\r\n" +
                        "authorship and/or a database (each, a \"Work\").\r\n\r" +
                        "\n" +
                        "Certain owners wish to permanently relinquish those rights to a Work for\r\n" +
                        "the purpose of contributing to a commons of creative, cultural and\r\n" +
                        "scientific works (\"Commons\") that the public can reliably and without fear\r\n" +
                        "of later claims of infringement build upon, modify, incorporate in other\r\n" +
                        "works, reuse and redistribute as freely as possible in any form whatsoever\r\n" +
                        "and for any purposes, including without limitation commercial purposes.\r\n" +
                        "These owners may contribute to the Commons to promote the ideal of a free\r\n" +
                        "culture and the further production of creative, cultural and scientific\r\n" +
                        "works, or to gain reputation or greater distribution for their Work in\r\n" +
                        "part through the use and efforts of others.\r\n\r" +
                        "\n" +
                        "For these and/or other purposes and motivations, and without any\r\n" +
                        "expectation of additional consideration or compensation, the person\r\n" +
                        "associating CC0 with a Work (the \"Affirmer\"), to the extent that he or she\r\n" +
                        "is an owner of Copyright and Related Rights in the Work, voluntarily\r\n" +
                        "elects to apply CC0 to the Work and publicly distribute the Work under its\r\n" +
                        "terms, with knowledge of his or her Copyright and Related Rights in the\r\n" +
                        "Work and the meaning and intended legal effect of CC0 on those rights.\r\n\r" +
                        "\n" +
                        "1. Copyright and Related Rights. A Work made available under CC0 may be\r\n" +
                        "protected by copyright and related or neighboring rights (\"Copyright and\r\n" +
                        "Related Rights\"). Copyright and Related Rights include, but are not\r\n" +
                        "limited to, the following:\r\n\r" +
                        "\n" +
                        "  i. the right to reproduce, adapt, distribute, perform, display,\r\n" +
                        "     communicate, and translate a Work;\r\n" +
                        " ii. moral rights retained by the original author(s) and/or performer(s);\r\n" +
                        "iii. publicity and privacy rights pertaining to a person's image or\r\n" +
                        "     likeness depicted in a Work;\r\n" +
                        " iv. rights protecting against unfair competition in regards to a Work,\r\n" +
                        "     subject to the limitations in paragraph 4(a), below;\r\n" +
                        "  v. rights protecting the extraction, dissemination, use and reuse of data\r\n" +
                        "     in a Work;\r\n" +
                        " vi. database rights (such as those arising under Directive 96/9/EC of the\r\n" +
                        "     European Parliament and of the Council of 11 March 1996 on the legal\r\n" +
                        "     protection of databases, and under any national implementation\r\n" +
                        "     thereof, including any amended or successor version of such\r\n" +
                        "     directive); and\r\n" +
                        "vii. other similar, equivalent or corresponding rights throughout the\r\n" +
                        "     world based on applicable law or treaty, and any national\r\n" +
                        "     implementations thereof.\r\n\r" +
                        "\n" +
                        "2. Waiver. To the greatest extent permitted by, but not in contravention\r\n" +
                        "of, applicable law, Affirmer hereby overtly, fully, permanently,\r\n" +
                        "irrevocably and unconditionally waives, abandons, and surrenders all of\r\n" +
                        "Affirmer's Copyright and Related Rights and associated claims and causes\r\n" +
                        "of action, whether now known or unknown (including existing as well as\r\n" +
                        "future claims and causes of action), in the Work (i) in all territories\r\n" +
                        "worldwide, (ii) for the maximum duration provided by applicable law or\r\n" +
                        "treaty (including future time extensions), (iii) in any current or future\r\n" +
                        "medium and for any number of copies, and (iv) for any purpose whatsoever,\r\n" +
                        "including without limitation commercial, advertising or promotional\r\n" +
                        "purposes (the \"Waiver\"). Affirmer makes the Waiver for the benefit of each\r\n" +
                        "member of the public at large and to the detriment of Affirmer's heirs and\r\n" +
                        "successors, fully intending that such Waiver shall not be subject to\r\n" +
                        "revocation, rescission, cancellation, termination, or any other legal or\r\n" +
                        "equitable action to disrupt the quiet enjoyment of the Work by the public\r\n" +
                        "as contemplated by Affirmer's express Statement of Purpose.\r\n\r" +
                        "\n" +
                        "3. Public License Fallback. Should any part of the Waiver for any reason\r\n" +
                        "be judged legally invalid or ineffective under applicable law, then the\r\n" +
                        "Waiver shall be preserved to the maximum extent permitted taking into\r\n" +
                        "account Affirmer's express Statement of Purpose. In addition, to the\r\n" +
                        "extent the Waiver is so judged Affirmer hereby grants to each affected\r\n" +
                        "person a royalty-free, non transferable, non sublicensable, non exclusive,\r\n" +
                        "irrevocable and unconditional license to exercise Affirmer's Copyright and\r\n" +
                        "Related Rights in the Work (i) in all territories worldwide, (ii) for the\r\n" +
                        "maximum duration provided by applicable law or treaty (including future\r\n" +
                        "time extensions), (iii) in any current or future medium and for any number\r\n" +
                        "of copies, and (iv) for any purpose whatsoever, including without\r\n" +
                        "limitation commercial, advertising or promotional purposes (the\r\n" +
                        "\"License\"). The License shall be deemed effective as of the date CC0 was\r\n" +
                        "applied by Affirmer to the Work. Should any part of the License for any\r\n" +
                        "reason be judged legally invalid or ineffective under applicable law, such\r\n" +
                        "partial invalidity or ineffectiveness shall not invalidate the remainder\r\n" +
                        "of the License, and in such case Affirmer hereby affirms that he or she\r\n" +
                        "will not (i) exercise any of his or her remaining Copyright and Related\r\n" +
                        "Rights in the Work or (ii) assert any associated claims and causes of\r\n" +
                        "action with respect to the Work, in either case contrary to Affirmer's\r\n" +
                        "express Statement of Purpose.\r\n\r" +
                        "\n" +
                        "4. Limitations and Disclaimers.\r\n\r" +
                        "\n" +
                        " a. No trademark or patent rights held by Affirmer are waived, abandoned,\r\n" +
                        "    surrendered, licensed or otherwise affected by this document.\r\n" +
                        " b. Affirmer offers the Work as-is and makes no representations or\r\n" +
                        "    warranties of any kind concerning the Work, express, implied,\r\n" +
                        "    statutory or otherwise, including without limitation warranties of\r\n" +
                        "    title, merchantability, fitness for a particular purpose, non\r\n" +
                        "    infringement, or the absence of latent or other defects, accuracy, or\r\n" +
                        "    the present or absence of errors, whether or not discoverable, all to\r\n" +
                        "    the greatest extent permissible under applicable law.\r\n" +
                        " c. Affirmer disclaims responsibility for clearing rights of other persons\r\n" +
                        "    that may apply to the Work or any use thereof, including without\r\n" +
                        "    limitation any person's Copyright and Related Rights in the Work.\r\n" +
                        "    Further, Affirmer disclaims responsibility for obtaining any necessary\r\n" +
                        "    consents, permissions or other rights required for any use of the\r\n" +
                        "    Work.\r\n" +
                        " d. Affirmer understands and acknowledges that Creative Commons is not a\r\n" +
                        "    party to this document and has no duty or obligation with respect to\r\n" +
                        "    this CC0 or use of the Work.");
                fileWriter.close();
            } else {
                JOptionPane.showMessageDialog(null, "License.MD exists or could not be created!!!");
            }
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "License.MD failed to create!");
            e.printStackTrace();
        }
    }
}
