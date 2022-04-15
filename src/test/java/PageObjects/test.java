package PageObjects;

import PageFactory.PageFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class test {
    public static void CheckBoxSelection() throws IOException {
        try {

                        //    System.out.println(ColapseSubRoots.get(i).getText());

                                int TreeNodeReactSize = PageFactory.wpf.TreeNodeReact.size();
                                if (TreeNodeReactSize > 0) {
                                    for (int l = 0; l <= TreeNodeReactSize; l++) {
                                        PageFactory.wpf.TreeNodeReact.get(l).click();
                                        PrintText = PrintText + " " + (PageFactory.wpf.TreeNodeReact.get(l).getText().toString());
                                    }
                                }
                            }
                        }
                    }
                    System.out.println("Out Side Loop : " + PrintText);

                }

            }
       catch(Throwable e){
            }
        }
    }

}
