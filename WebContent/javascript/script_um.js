/**
 * from umesh
 */


// will only enable button after agreed 
function enableButton1()
{
    if(document.getElementById("policy_u").checked)
    {
        document.getElementById("submit_btn_u").disabled = false;

    }
}