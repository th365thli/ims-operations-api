/*********************************************************************************
 * Licensed Materials - Property of IBM
 * 5655-TAC
 * (C) Copyright IBM Corp. 2013 All Rights Reserved. 
 * US Government Users Restricted Rights - Use, duplication or
 * disclosure restricted by GSA ADP Schedule Contract with 
 * IBM Corp.               
 *********************************************************************************/

package om.result;

import java.util.Properties;

/**
 * Interface is the most basic of contracts used to return results from IMS executed
 * commands. The generic contract is a Properties Map.
 * @author ddimatos
 *
 */
public interface OmResult {

    /**
     * Identifies the type of OM Command
     */
    public enum COMMAND_TYPE{
        /** IMS type-1 command **/
        TYPE1("TYPE1"),
        
        /** IMS type-2 command **/
        TYPE2("TYPE2");
        
        private String commandType = "";
        
        private COMMAND_TYPE(String commandType) {
            this.commandType = commandType;
        }
        
        @Override
        public String toString(){
            return commandType.toString();
        }
    }
	
	/**
	 * Return a Properties object with all name/value pairs trimmed of whitespace
	 * @return Properties[] response
	 */
	public Properties[] getResponseProperties();
	
	/**
	 * Set the response as a name/value pair Properties[] object
	 * @param props
	 * @return Properties[] response
	 */
	public void setResponseProperties(Properties[] props);
	
}