/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.addressbook;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AddressBook")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ABPersonProperty/*</name>*/ 
    extends /*<extends>*/ABProperty/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(ABPersonProperty.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    public static final ABPersonProperty FirstName = new ABPersonProperty() {
        public int value() {
            return FirstNameValue();
        }
    };
    public static final ABPersonProperty LastName = new ABPersonProperty() {
        public int value() {
            return LastNameValue();
        }
    };
    public static final ABPersonProperty MiddleName = new ABPersonProperty() {
        public int value() {
            return MiddleNameValue();
        }
    };
    public static final ABPersonProperty Prefix = new ABPersonProperty() {
        public int value() {
            return PrefixValue();
        }
    };
    public static final ABPersonProperty Suffix = new ABPersonProperty() {
        public int value() {
            return SuffixValue();
        }
    };
    public static final ABPersonProperty Nickname = new ABPersonProperty() {
        public int value() {
            return NicknameValue();
        }
    };
    public static final ABPersonProperty FirstNamePhonetic = new ABPersonProperty() {
        public int value() {
            return FirstNamePhoneticValue();
        }
    };
    public static final ABPersonProperty LastNamePhonetic = new ABPersonProperty() {
        public int value() {
            return LastNamePhoneticValue();
        }
    };
    public static final ABPersonProperty MiddleNamePhonetic = new ABPersonProperty() {
        public int value() {
            return MiddleNamePhoneticValue();
        }
    };
    public static final ABPersonProperty Organization = new ABPersonProperty() {
        public int value() {
            return OrganizationValue();
        }
    };
    public static final ABPersonProperty JobTitle = new ABPersonProperty() {
        public int value() {
            return JobTitleValue();
        }
    };
    public static final ABPersonProperty Department = new ABPersonProperty() {
        public int value() {
            return DepartmentValue();
        }
    };
    public static final ABPersonProperty Email = new ABPersonProperty() {
        public int value() {
            return EmailValue();
        }
    };
    public static final ABPersonProperty Birthday = new ABPersonProperty() {
        public int value() {
            return BirthdayValue();
        }
    };
    public static final ABPersonProperty Note = new ABPersonProperty() {
        public int value() {
            return NoteValue();
        }
    };
    public static final ABPersonProperty CreationDate = new ABPersonProperty() {
        public int value() {
            return CreationDateValue();
        }
    };
    public static final ABPersonProperty ModificationDate = new ABPersonProperty() {
        public int value() {
            return ModificationDateValue();
        }
    };
    public static final ABPersonProperty Address = new ABPersonProperty() {
        public int value() {
            return AddressValue();
        }
    };
    public static final ABPersonProperty Date = new ABPersonProperty() {
        public int value() {
            return DateValue();
        }
    };
    public static final ABPersonProperty Kind = new ABPersonProperty() {
        public int value() {
            return KindValue();
        }
    };
    public static final ABPersonProperty Phone = new ABPersonProperty() {
        public int value() {
            return PhoneValue();
        }
    };
    public static final ABPersonProperty InstantMessage = new ABPersonProperty() {
        public int value() {
            return InstantMessageValue();
        }
    };
    public static final ABPersonProperty URL = new ABPersonProperty() {
        public int value() {
            return URLValue();
        }
    };
    public static final ABPersonProperty RelatedNames = new ABPersonProperty() {
        public int value() {
            return RelatedNamesValue();
        }
    };
    /**
     * @since Available in iOS 5.0 and later.
     */
    public static final ABPersonProperty SocialProfile = new ABPersonProperty() {
        public int value() {
            return SocialProfileValue();
        }
    };
    private static ABPersonProperty[] values = new ABPersonProperty[] {FirstName, LastName, Prefix, Suffix, Nickname, FirstNamePhonetic, LastNamePhonetic, MiddleNamePhonetic, Organization, JobTitle, Department, Email, Birthday, Note, CreationDate, ModificationDate, Address, Date, Kind, Phone, InstantMessage, URL, RelatedNames, SocialProfile};
    
    private ABPersonProperty () {
    }
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public static ABPersonProperty valueOf(int value) {
        for (ABPersonProperty v : values) {
            if (v.value() == value) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/ABPersonProperty/*</name>*/.class.getName());
    }
    /*<methods>*/
    @GlobalValue(symbol="kABPersonFirstNameProperty", optional=true)
    protected static native int FirstNameValue();
    @GlobalValue(symbol="kABPersonLastNameProperty", optional=true)
    protected static native int LastNameValue();
    @GlobalValue(symbol="kABPersonMiddleNameProperty", optional=true)
    protected static native int MiddleNameValue();
    @GlobalValue(symbol="kABPersonPrefixProperty", optional=true)
    protected static native int PrefixValue();
    @GlobalValue(symbol="kABPersonSuffixProperty", optional=true)
    protected static native int SuffixValue();
    @GlobalValue(symbol="kABPersonNicknameProperty", optional=true)
    protected static native int NicknameValue();
    @GlobalValue(symbol="kABPersonFirstNamePhoneticProperty", optional=true)
    protected static native int FirstNamePhoneticValue();
    @GlobalValue(symbol="kABPersonLastNamePhoneticProperty", optional=true)
    protected static native int LastNamePhoneticValue();
    @GlobalValue(symbol="kABPersonMiddleNamePhoneticProperty", optional=true)
    protected static native int MiddleNamePhoneticValue();
    @GlobalValue(symbol="kABPersonOrganizationProperty", optional=true)
    protected static native int OrganizationValue();
    @GlobalValue(symbol="kABPersonJobTitleProperty", optional=true)
    protected static native int JobTitleValue();
    @GlobalValue(symbol="kABPersonDepartmentProperty", optional=true)
    protected static native int DepartmentValue();
    @GlobalValue(symbol="kABPersonEmailProperty", optional=true)
    protected static native int EmailValue();
    @GlobalValue(symbol="kABPersonBirthdayProperty", optional=true)
    protected static native int BirthdayValue();
    @GlobalValue(symbol="kABPersonNoteProperty", optional=true)
    protected static native int NoteValue();
    @GlobalValue(symbol="kABPersonCreationDateProperty", optional=true)
    protected static native int CreationDateValue();
    @GlobalValue(symbol="kABPersonModificationDateProperty", optional=true)
    protected static native int ModificationDateValue();
    @GlobalValue(symbol="kABPersonAddressProperty", optional=true)
    protected static native int AddressValue();
    @GlobalValue(symbol="kABPersonDateProperty", optional=true)
    protected static native int DateValue();
    @GlobalValue(symbol="kABPersonKindProperty", optional=true)
    protected static native int KindValue();
    @GlobalValue(symbol="kABPersonPhoneProperty", optional=true)
    protected static native int PhoneValue();
    @GlobalValue(symbol="kABPersonInstantMessageProperty", optional=true)
    protected static native int InstantMessageValue();
    @GlobalValue(symbol="kABPersonURLProperty", optional=true)
    protected static native int URLValue();
    @GlobalValue(symbol="kABPersonRelatedNamesProperty", optional=true)
    protected static native int RelatedNamesValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalValue(symbol="kABPersonSocialProfileProperty", optional=true)
    protected static native int SocialProfileValue();
    
    @Bridge(symbol="ABPersonGetTypeOfProperty", optional=true)
    protected static native ABPropertyType getType(int property);
    @Bridge(symbol="ABPersonCopyLocalizedPropertyName", optional=true)
    protected static native String getLocalizedPropertyName(int property);
    /*</methods>*/
}
