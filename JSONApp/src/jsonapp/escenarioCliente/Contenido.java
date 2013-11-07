/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonapp.escenarioCliente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos.perez
 */
public class Contenido {

    String name;
    String group;
    String parentNodeId;
    String codeLang;
    String level;
    String url;
    String partialUrl;
    String flowName;
    String flowNameResp;
    String order;
    String operative;
    String active;
    String visibleChildren;
    List<Contenido> children;

    public Contenido() {
        children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public String getCodeLang() {
        return codeLang;
    }

    public void setCodeLang(String codeLang) {
        this.codeLang = codeLang;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPartialUrl() {
        return partialUrl;
    }

    public void setPartialUrl(String partialUrl) {
        this.partialUrl = partialUrl;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public String getFlowNameResp() {
        return flowNameResp;
    }

    public void setFlowNameResp(String flowNameResp) {
        this.flowNameResp = flowNameResp;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getOperative() {
        return operative;
    }

    public void setOperative(String operative) {
        this.operative = operative;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getVisibleChildren() {
        return visibleChildren;
    }

    public void setVisibleChildren(String visibleChildren) {
        this.visibleChildren = visibleChildren;
    }

    public List<Contenido> getChildren() {
        return children;
    }

    public void setChildren(List<Contenido> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Contenido{" + "name=" + name + '}';
    }
    

}
