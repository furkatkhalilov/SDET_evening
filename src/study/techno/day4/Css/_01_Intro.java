package study.techno.day4.Css;

import org.junit.Test;

public class _01_Intro {

    public static void main(String[] args) {


        /*

        For the multiple attributes
        input[type='Radio'][value='Personal use']

        We can use css selector with out tag name as well
            [for='u_N8w_4586_1']

        input.form-control[type=text] = input[class='form-control'][type=text]
            if the class equal to form-control and type is equal to text

        label.checkbox-w[for='u_N8w_4603'] = label[class='checkbox-w'][for='u_N8w_4603']

           Do we need to use single quote '  in the css

           If attribute value multiple words "vertical-align: inherit;" then we have to use it
           If attribute value single word then we do not neet to use it

            font[style='vertical-align: inherit;']
            h2[data-id=heading_2] no need to use single quote

            INTERVIEW QUESTION
             How do you handle dynamic elements?
                Contains , start-with and end-with

            To check is the element containing the value
                h2[data-id*='ng_1'] <-- contains
                h2[data-id^='head'] <-- start with
                h2[data-id$='ing_3'] <-- ends with

            Parent to child
                #section_3>label
                #section_3>label>span find the child of id = section_3 then child is label then
                  navigate to span child.

                #section_3 span <-- check the child and also child of the childs

            Sibling of the element
                use this icon ~

                h2~textarea <-- find all the tesxarea if it is sibling of the h2

                h2[id='u_N8w_89601']~input  <-- find all the textarea if  it is sibling of the h2
                    and id should be "u_N8w_89601"


         */

    }

}
