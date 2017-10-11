package cc.blog.service.impl;

import cc.blog.service.FormService;

/**
 * Created by Elvis on 2017/10/9.
 */
public class FormServiceImpl implements FormService {
    @Override
    public void removeTopic(int topicId) {
        System.out.println("删除Topic记录..." + topicId);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void removeForm(int formId) {
        System.out.println("删除Form记录..." + formId);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
