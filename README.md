<div class="Box-sc-g0xbh4-0 QkQOb js-snippet-clipboard-copy-unpositioned" data-hpc="true"><article class="markdown-body entry-content container-lg" itemprop="text"><div class="markdown-heading" dir="auto"><h1 tabindex="-1" class="heading-element" dir="auto" _msttexthash="159926" _msthash="269">OpenWMS.org</h1><a id="user-content-openwmsorg" class="anchor" aria-label="永久链接：OpenWMS.org" href="#openwmsorg" _mstaria-label="439621" _msthash="270"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto" _msttexthash="521447797" _msthash="271">是一个免费使用且可扩展的仓库管理系统 （WMS），带有用于自动和手动的物料流控制 （MFC） 系统
仓库。</p>
<p dir="auto" _msttexthash="36167612" _msthash="272">在 <a href="https://wiki.openwms.cloud/projects/openwms/wiki/00-dot-02-business-services" rel="nofollow" _istranslated="1">Wiki</a> 中查找更多文档</p>
<div class="markdown-heading" dir="auto"><h1 tabindex="-1" class="heading-element" dir="auto" _msttexthash="5495750" _msthash="273">建筑</h1><a id="user-content-architecture" class="anchor" aria-label="永久链接： 架构" href="#architecture" _mstaria-label="516191" _msthash="274"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto" _msttexthash="3120955019" _msthash="275">当前的架构没有应用技术分层架构（就像以前的技术一样），而是专注于
业务组件。具有高内聚力的业务功能作为小型可部署软件组件保存在一起。每
组件具有自己的开发生命周期，具有自己的 API 演化路线图和单独的数据存储。以下草图显示
OpenWMS.org 系统的所有现有组件以及所有可能的周围系统。</p>
<p dir="auto"><a target="_blank" rel="noopener noreferrer" href="/openwms/org.openwms/blob/master/src/docs/res/microservice_architecture.jpeg"><img src="/openwms/org.openwms/raw/master/src/docs/res/microservice_architecture.jpeg" alt="建筑" style="max-width: 100%;" _mstalt="206856" _msthash="276"></a></p>
<p dir="auto"><font _mstmutation="1" _msttexthash="38749363679" _msthash="277">除了用户界面之外，其他几个系统还与 OpenWMS.org 系统进行交互。顶部的 ERP 系统正在发送高级任务
OpenWMS.org，例如，客户订单的订单行引用由 .
OpenWMS.org 通过编排底层子系统来完成这些任务。OpenWMS.org 和 ERP 系统之间的通信可能
是双向的，OpenWMS.org 尽管将状态消息发送回 ERP，或者可能请求产品目录更新，具体取决于
项目需求。在上图的底部，如果系统连接到靠近演员和传感器的设备，则会自动
仓库。这些设备在硬件资源和协议栈方面几乎受到限制。典型的 <a href="https://en.wikipedia.org/wiki/Programmable_logic_controller" rel="nofollow" _mstmutation="1" _istranslated="1">PLC</a>（可编程逻辑控制器）用于与现场传感器交互和控制参与者。OpenWMS.org 是一个开源软件，
因此，在商用 PLC 产品上促进开源硬件组件的使用。支持设备的首选
是板子，如 <a href="https://www.raspberrypi.org/" rel="nofollow" _mstmutation="1" _istranslated="1">Raspberry Pi</a> 或工业 <a href="https://revolution.kunbus.com/" rel="nofollow" _mstmutation="1" _istranslated="1">Revolution Pi</a>，具有开放的
微控制器架构。但尽管如此，它也支持封闭的专有系统。所有这些子系统都有一个
共同点：它们靠近硬件，并期望控制电机和开关门的响应时间在毫秒范围内
非常快。他们有能力通过一直重复请求来关闭服务组件。典型的 Web 应用程序
客户端的不同之处在于，基础架构负责 DoS 攻击，而应用程序服务器则池化传入流量。</font><code>Inventory Service</code></p>
<p dir="auto" _msttexthash="244108280" _msthash="278">在组件对应的 GitHub 页面上阅读有关每个组件架构和设计的更多信息。</p>
<div class="markdown-heading" dir="auto"><h1 tabindex="-1" class="heading-element" dir="auto" _msttexthash="5041816" _msthash="279">技术</h1><a id="user-content-technologies" class="anchor" aria-label="永久链接： 技术" href="#technologies" _mstaria-label="515372" _msthash="280"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto" _msttexthash="6474885157" _msthash="281">除了一堆 Spring Framework 子项目之外，OpenWMS.org 还支持流行的 BPMN 工作流引擎，如 <a href="https://www.activiti.org" rel="nofollow" _istranslated="1">Activiti</a>、<a href="https://www.flowable.org" rel="nofollow" _istranslated="1">Flowable</a> 和 <a href="https://www.camunda.org" rel="nofollow" _istranslated="1">Camunda</a>，以在传输层做出路由决策。
RDBMS 访问通常是通过 <a href="https://de.wikipedia.org/wiki/Jakarta_Persistence_API" rel="nofollow" _istranslated="1">Jakarta Persistence API</a> 实现的。一些
组件也可能使用 NoSQL 数据库，如 MongoDB。<a href="https://rabbitmq.com" rel="nofollow" _istranslated="1">RabbitMQ</a> 与 Spring Integration 项目相结合
用作异步事件和命令传播的事件代理。目前，所有微服务都实现为 Spring Boot
旨在在任何现代 PaaS 云平台上运行的应用程序，例如 <a href="https://azure.microsoft.com/de-de/services/kubernetes-service" rel="nofollow" _istranslated="1">Azure Kubernetes Service</a>、<a href="https://aws.amazon.com/eks" rel="nofollow" _istranslated="1">AWS EKS</a> 或 <a href="https://www.redhat.com/en/technologies/cloud-computing/openshift" rel="nofollow" _istranslated="1">Redhat OpenShift</a>。</p>
<div class="markdown-heading" dir="auto"><h1 tabindex="-1" class="heading-element" dir="auto" _msttexthash="7447479" _msthash="282">微服务</h1><a id="user-content-microservices" class="anchor" aria-label="永久链接： 微服务" href="#microservices" _mstaria-label="560053" _msthash="283"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto" _msttexthash="1282514753" _msthash="284">由于 OpenWMS.org 构建在遵循 <a href="https://12factor.net" rel="nofollow" _istranslated="1">12 因素</a>方法的现代分布式微服务架构之上，因此所有功能业务组件都在自己的 SDLC（软件开发生命周期）和自己的源代码中进行管理
存储 库。</p>
<markdown-accessiblity-table data-catalyst=""><table>
<thead>
<tr>
<th _msttexthash="11176152" _msthash="285">服务名称</th>
<th _msttexthash="7108023" _msthash="286">存储 库</th>
<th _msttexthash="7066072" _msthash="287">可及性</th>
<th _msttexthash="9675445" _msthash="288">许可证</th>
</tr>
</thead>
<tbody>
<tr>
<td _msttexthash="17262622" _msthash="289">服务注册中心</td>
<td><a href="https://github.com/spring-labs/org.openwms.services" _msttexthash="445991" _msthash="290">org.openwms.services</a></td>
<td _msttexthash="4065100" _msthash="291">公共</td>
<td _msttexthash="8707296" _msthash="292">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="12614082" _msthash="293">配置服务</td>
<td><a href="https://github.com/spring-labs/org.openwms.configuration" _msttexthash="648557" _msthash="294">org.openwms.configuration</a></td>
<td _msttexthash="4065100" _msthash="295">公共</td>
<td _msttexthash="8707296" _msthash="296">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="10970934" _msthash="297">网关服务</td>
<td><a href="https://github.com/spring-labs/org.openwms.gateway" _msttexthash="408863" _msthash="298">org.openwms.gateway</a></td>
<td _msttexthash="4065100" _msthash="299">公共</td>
<td _msttexthash="8707296" _msthash="300">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="11125998" _msthash="301">网关服务 ENTERPRISE</td>
<td><a href="https://github.com/interface21-io/org.openwms.gateway" _msttexthash="408863" _msthash="302">org.openwms.gateway</a></td>
<td _msttexthash="4932395" _msthash="303">私人</td>
<td _msttexthash="9073870" _msthash="304">GPLv3 版本</td>
</tr>
<tr>
<td _msttexthash="21778926" _msthash="305">身份验证服务</td>
<td><a href="https://github.com/spring-labs/org.openwms.auth" _msttexthash="308269" _msthash="306">org.openwms.auth</a></td>
<td _msttexthash="4932395" _msthash="307">私人</td>
<td _msttexthash="9073870" _msthash="308">GPLv3 版本</td>
</tr>
<tr>
<td _msttexthash="6476509" _msthash="309">UAA 服务</td>
<td><a href="https://github.com/openwms/org.openwms.core.uaa" _msttexthash="420368" _msthash="310">org.openwms.core.uaa</a></td>
<td _msttexthash="4065100" _msthash="311">公共</td>
<td _msttexthash="8707296" _msthash="312">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="10258235" _msthash="313">优惠服务</td>
<td><a href="https://github.com/openwms/org.openwms.core.preferences" _msttexthash="760292" _msthash="314">org.openwms.core.preferences</a></td>
<td _msttexthash="4065100" _msthash="315">公共</td>
<td _msttexthash="8707296" _msthash="316">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="10348468" _msthash="317">打印服务</td>
<td><a href="https://github.com/openwms/org.openwms.core.printing" _msttexthash="631865" _msthash="318">org.openwms.core.printing</a></td>
<td _msttexthash="4932395" _msthash="319">私人</td>
<td _msttexthash="9073870" _msthash="320">GPLv3 版本</td>
</tr>
<tr>
<td _msttexthash="12540372" _msthash="321">翻译服务</td>
<td><a href="https://github.com/openwms/org.openwms.core.lang" _msttexthash="458107" _msthash="322">org.openwms.core.lang</a></td>
<td _msttexthash="17254042" _msthash="323">个人预览版</td>
<td _msttexthash="8707296" _msthash="324">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="9901567" _msthash="325">公共服务</td>
<td><a href="https://github.com/openwms/org.openwms.common.service" _msttexthash="672347" _msthash="326">org.openwms.common.service</a></td>
<td _msttexthash="4065100" _msthash="327">公共</td>
<td _msttexthash="8707296" _msthash="328">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="24760606" _msthash="329">OSIP/TCP 驱动程序</td>
<td><a href="https://github.com/openwms/org.openwms.common.comm" _msttexthash="542373" _msthash="330">org.openwms.common.comm</a></td>
<td _msttexthash="4065100" _msthash="331">公共</td>
<td _msttexthash="8707296" _msthash="332">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="20194096" _msthash="333">OPCUA 驱动程序</td>
<td><a href="https://github.com/interface21-io/org.openwms.common.opcua" _msttexthash="583986" _msthash="334">org.openwms.common.opcua</a></td>
<td _msttexthash="17254042" _msthash="335">个人预览版</td>
<td _msttexthash="8707296" _msthash="336">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="10386103" _msthash="337">交易服务</td>
<td><a href="https://github.com/openwms/org.openwms.common.transactions" _msttexthash="923780" _msthash="338">org.openwms.common.transactions</a></td>
<td _msttexthash="17254042" _msthash="339">个人预览版</td>
<td _msttexthash="8707296" _msthash="340">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="18050344" _msthash="341">常见任务服务</td>
<td><a href="https://github.com/openwms/org.openwms.common.tasks" _msttexthash="589485" _msthash="342">org.openwms.common.tasks</a></td>
<td _msttexthash="4065100" _msthash="343">公共</td>
<td _msttexthash="8707296" _msthash="344">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="13009243" _msthash="345">运输服务</td>
<td><a href="https://github.com/openwms/org.openwms.tms.transportation" _msttexthash="885677" _msthash="346">org.openwms.tms.transportation</a></td>
<td _msttexthash="4065100" _msthash="347">公共</td>
<td _msttexthash="8707296" _msthash="348">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="9039056" _msthash="349">TMS 路由</td>
<td><a href="https://github.com/openwms/org.openwms.tms.routing" _msttexthash="555698" _msthash="350">org.openwms.tms.routing</a></td>
<td _msttexthash="4065100" _msthash="351">公共</td>
<td _msttexthash="8707296" _msthash="352">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="10852426" _msthash="353">接收服务</td>
<td><a href="https://github.com/openwms/org.openwms.wms.receiving" _msttexthash="630474" _msthash="354">org.openwms.wms.receiving</a></td>
<td _msttexthash="4065100" _msthash="355">公共</td>
<td _msttexthash="8707296" _msthash="356">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="10471604" _msthash="357">库存服务</td>
<td><a href="https://github.com/interface21-io/org.openwms.wms.inventory" _msttexthash="648869" _msthash="358">org.openwms.wms.inventory</a></td>
<td _msttexthash="17254042" _msthash="359">个人预览版</td>
<td _msttexthash="8707296" _msthash="360">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="8420178" _msthash="361">选取库</td>
<td><a href="https://github.com/openwms/org.openwms.wms.picking" _msttexthash="545077" _msthash="362">org.openwms.wms.picking</a></td>
<td _msttexthash="4932395" _msthash="363">私人</td>
<td _msttexthash="9073870" _msthash="364">GPLv3 版本</td>
</tr>
<tr>
<td _msttexthash="10878764" _msthash="365">移动服务</td>
<td><a href="https://github.com/openwms/org.openwms.wms.movements" _msttexthash="596206" _msthash="366">org.openwms.wms.movement</a></td>
<td _msttexthash="4065100" _msthash="367">公共</td>
<td _msttexthash="8707296" _msthash="368">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="13369278" _msthash="369">WMS 任务服务</td>
<td><a href="https://github.com/openwms/org.openwms.wms.tasks" _msttexthash="473616" _msthash="370">org.openwms.wms.tasks</a></td>
<td _msttexthash="17254042" _msthash="371">个人预览版</td>
<td _msttexthash="8707296" _msthash="372">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="16147820" _msthash="373">合作伙伴服务</td>
<td><a href="https://github.com/interface21-io/org.openwms.wms.partners" _msttexthash="597974" _msthash="374">org.openwms.wms.partners</a></td>
<td _msttexthash="17254042" _msthash="375">个人预览版</td>
<td _msttexthash="8707296" _msthash="376">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="11596702" _msthash="377">卡车服务</td>
<td><a href="https://github.com/openwms/org.openwms.wms.trucks" _msttexthash="515918" _msthash="378">org.openwms.wms.trucks</a></td>
<td _msttexthash="17254042" _msthash="379">个人预览版</td>
<td _msttexthash="8707296" _msthash="380">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="13009243" _msthash="381">运输服务</td>
<td><a href="https://github.com/openwms/org.openwms.wms.shipping" _msttexthash="592748" _msthash="382">org.openwms.wms.shipping</a></td>
<td _msttexthash="17254042" _msthash="383">个人预览版</td>
<td _msttexthash="8707296" _msthash="384">阿帕奇-2.0</td>
</tr>
<tr>
<td _msttexthash="7411885" _msthash="385">上架库</td>
<td><a href="https://github.com/openwms/org.openwms.wms.putaway" _msttexthash="557934" _msthash="386">org.openwms.wms.putaway</a></td>
<td _msttexthash="4932395" _msthash="387">私人</td>
<td _msttexthash="9073870" _msthash="388">GPLv3 版本</td>
</tr>
<tr>
<td _msttexthash="13586144" _msthash="389">SAP 适配器</td>
<td><a href="https://github.com/openwms/org.openwms.wms.sap" _msttexthash="395811" _msthash="390">org.openwms.wms.sap</a></td>
<td _msttexthash="4932395" _msthash="391">私人</td>
<td _msttexthash="9073870" _msthash="392">GPLv3 版本</td>
</tr>
<tr>
<td _msttexthash="19928246" _msthash="393">Dynamics 适配器</td>
<td><a href="https://github.com/openwms/org.openwms.wms.msdynamics" _msttexthash="680329" _msthash="394">org.openwms.wms.msdynamics</a></td>
<td _msttexthash="4932395" _msthash="395">私人</td>
<td _msttexthash="9073870" _msthash="396">GPLv3 版本</td>
</tr>
<tr>
<td _msttexthash="19927427" _msthash="397">NetSuite 适配器</td>
<td><a href="https://github.com/openwms/org.openwms.wms.netsuite" _msttexthash="598143" _msthash="398">org.openwms.wms.netsuite</a></td>
<td _msttexthash="4932395" _msthash="399">私人</td>
<td _msttexthash="9073870" _msthash="400">GPLv3 版本</td>
</tr>
<tr>
<td _msttexthash="11350846" _msthash="401">WMS 编排器</td>
<td><a href="https://github.com/openwms/org.openwms.wms.orchestrator" _msttexthash="781703" _msthash="402">org.openwms.wms.orchestrator</a></td>
<td _msttexthash="17254042" _msthash="403">个人预览版</td>
<td _msttexthash="8707296" _msthash="404">阿帕奇-2.0</td>
</tr>
</tbody>
</table></markdown-accessiblity-table>
<div class="markdown-heading" dir="auto"><h1 tabindex="-1" class="heading-element" dir="auto" _msttexthash="11693487" _msthash="405">发展现状</h1><a id="user-content-current-state-of-development" class="anchor" aria-label="永久链接：当前开发状态" href="#current-state-of-development" _mstaria-label="1162499" _msthash="406"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto" _msttexthash="1809427048" _msthash="407">大多数组件正在积极开发中。2016 年，整个产品已从技术结构化的 OSGi 架构迁移过来
迈向具有 Spring Boot 微服务和 Netflix OSS 组件的面向业务的架构。以前发布的文档
版本仍然存在于 <a href="http://openwms2005.sourceforge.net" rel="nofollow" _istranslated="1">SourceForge.net</a> 和 <a href="https://openwms.atlassian.net/wiki" rel="nofollow" _istranslated="1">Atlassian Confluence</a> 上。<strong _istranslated="1">所有当前文档均在 <a href="https://wiki.openwms.cloud" rel="nofollow" _istranslated="1">OpenWMS Cloud Wiki</a> 中维护</strong>。</p>
<div class="markdown-heading" dir="auto"><h1 tabindex="-1" class="heading-element" dir="auto" _msttexthash="14819883" _msthash="408">以前的架构</h1><a id="user-content-previous-architectures" class="anchor" aria-label="永久链接：以前的架构" href="#previous-architectures" _mstaria-label="932867" _msthash="409"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a></div>
<p dir="auto" _msttexthash="1293149325" _msthash="410">该项目始于 2005 年，采用基于 EJB2.1 的 J2EE 服务器方法，带有 XDoclets、Hibernate 和 JavaServer Faces （JSF）。在超过
15 年来，我们看到了一系列技术解决了所有相同的问题。</p>
<p dir="auto" _msttexthash="13527602569" _msthash="411">PoC 已经用 EJB2.1 实现，但该项目实际上是从 EJB3.0 开始的。自 2007 年左右以来，OpenWMS.org 以 Spring 为基础
框架，这仍然很好，是正确的选择。Spring 与 OSGi 的结合似乎是构建模块化的完美匹配
和可扩展基础项目。不幸的是，Spring 停止了他们在 OSGi 上的努力，特别是在 Spring dmServer 和 Spring Dynamic Modules 上
.在过渡到当前微服务架构的步骤中，我们将所有 OSGi 捆绑包放入一个胖 JavaEE WAR 部署单元中以运行
应用程序位于 Apache Tomcat 等 servlet 容器上。之后，我们重新设计了所有服务和业务功能，并应用了
微服务架构。不再支持独立的 WAR 部署，因为社区没有要求这样做。只有
目前支持微服务架构。</p>
</article></div>
